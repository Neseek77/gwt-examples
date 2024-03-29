package org.gonevertical.demo.client;

import com.google.gwt.user.client.rpc.AsyncCallback;


/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface RpcServiceAsync {
  
	public void callServer(CallData callData, AsyncCallback<CallData> callback);
	
}
