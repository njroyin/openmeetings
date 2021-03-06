/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.web.components.admin.configurations;

import org.apache.openmeetings.data.basic.dao.ConfigurationDao;
import org.apache.openmeetings.persistence.beans.basic.Configuration;
import org.apache.openmeetings.web.components.admin.AdminPanel;
import org.apache.openmeetings.web.components.admin.SearchableDataView;
import org.apache.openmeetings.web.components.admin.PagedEntityListPanel;
import org.apache.openmeetings.web.data.DataViewContainer;
import org.apache.openmeetings.web.data.SearchableDataProvider;
import org.apache.openmeetings.web.data.OrderByBorder;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.repeater.Item;

/**
 * add/update/delete {@link Configuration}
 * 
 * @author swagner
 * 
 */
public class ConfigsPanel extends AdminPanel {
	
	private static final long serialVersionUID = -1L;
	private ConfigForm form;
	
	@Override
	public void onMenuPanelLoad(AjaxRequestTarget target) {
		target.appendJavaScript("omConfigPanelInit();");
	}

	@SuppressWarnings("unchecked")
	public ConfigsPanel(String id) {
		super(id);
		
		SearchableDataView<Configuration> dataView = new SearchableDataView<Configuration>("configList"
			, new SearchableDataProvider<Configuration>(ConfigurationDao.class)) {
			private static final long serialVersionUID = 8715559628755439596L;

			@Override
			protected void populateItem(final Item<Configuration> item) {
				final Configuration configuration = item.getModelObject();
				item.add(new Label("configuration_id", "" + configuration.getConfiguration_id()));
				item.add(new Label("conf_key", "" + configuration.getConf_key()));
				item.add(new Label("conf_value", "" + configuration.getConf_value()));
				item.add(new AjaxEventBehavior("onclick") {
					private static final long serialVersionUID = -8069413566800571061L;

					protected void onEvent(AjaxRequestTarget target) {
						form.hideNewRecord();
						form.setModelObject(configuration);
						target.add(form);
						target.appendJavaScript("omConfigPanelInit();");
					}
				});
				item.add(AttributeModifier.replace("class", "clickable "
						+ ((item.getIndex() % 2 == 1) ? "even" : "odd")));
			}
		};
		final WebMarkupContainer listContainer = new WebMarkupContainer("listContainer");
		add(listContainer.add(dataView).setOutputMarkupId(true));
		DataViewContainer<Configuration> container = new DataViewContainer<Configuration>(listContainer, dataView);
		container.setLinks(new OrderByBorder<Configuration>("orderById", "configuration_id", container)
				, new OrderByBorder<Configuration>("orderByKey", "conf_key", container)
				, new OrderByBorder<Configuration>("orderByValue", "conf_value", container));
		add(container.orderLinks);
		add(new PagedEntityListPanel("navigator", dataView) {
			private static final long serialVersionUID = 5097048616003411362L;

			@Override
			protected void onEvent(AjaxRequestTarget target) {
				target.add(listContainer);
			}
		});
		
		form = new ConfigForm("form", listContainer, new Configuration());
		form.showNewRecord();
        add(form);
		
	}
}
