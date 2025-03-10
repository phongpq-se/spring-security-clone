package org.springframework.security.oauth2.core.phongpq;

import org.junit.jupiter.api.Test;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2Token;

import java.time.Instant;

public class OAuth2TokenTest {

	@Test
	void testAbc() {

		var oauth2Token = new OAuth2AccessToken(
				OAuth2AccessToken.TokenType.BEARER,
				"Abc",
				Instant.ofEpochMilli(1000),
				Instant.ofEpochMilli(2000)
		);

		System.out.println(oauth2Token.toString());
	}
}
