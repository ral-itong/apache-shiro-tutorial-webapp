/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import com.stormpath.sdk.client.ClientBuilder;
import com.stormpath.sdk.client.Proxy;
import com.stormpath.shiro.client.ClientFactory;

/**
 *
 * @author itong
 */
public class CustomClientFactory extends ClientFactory {

    private ClientBuilder clientBuilder;
    public CustomClientFactory() {
        super();
        this.clientBuilder = new ClientBuilder();
        clientBuilder.setProxy(new Proxy("10.138.15.10", 8080));
        super.setClientBuilder(clientBuilder);
    }
    
    
    
    
}
