/*
 * RED5 Open Source Flash Server - http://code.google.com/p/red5/
 * 
 * Copyright 2006-2012 by respective authors (see below). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.red5.client.net.rtmpt;

import org.apache.mina.core.buffer.IoBuffer;
import org.red5.server.net.rtmp.codec.RTMP;

public class RTMPTClientConnection extends BaseRTMPTConnection {
	
	public RTMPTClientConnection() {
		super(PERSISTENT);
		this.state = new RTMP();
	}
	
	protected void onInactive() {
		this.close();
	}
	
	public IoBuffer getPendingMessages(int targetSize) {
		return foldPendingMessages(targetSize);
	}
}