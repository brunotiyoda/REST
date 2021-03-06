package br.com.rest.clientTest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	@Test
	public void testaConexaoComOServidor() {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://www.mocky.io");
		String conteudo = webTarget.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
		Assert.assertTrue(conteudo.contains("Rua Vergueiro 3185"));
	}
}
