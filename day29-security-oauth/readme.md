## Security and OAuth
* Credentials: knowledge (password), possession (key, token), inherence (fingerprint)
* Authentication: You are who you say you are.
* Authorization: What are you allowed to do?
* TLS (formerly SSL): encrypted link between the client and server. (encryption + certificates)
* HTTPS: a web communication protocol that uses TLS for security.

### User Sessions
* Login: add the user to the session.
* Logout: invalidate the session.

### Where to put your secrets
* /src/main/resources/config/application.properties
* In .gitignore add `/src/main/resources/config/application.properties`
* `@Value("${my.property.here}") private String myVar;`

### OAuth
* OpenID: open standard for 3rd party authentication. uses OAuth 2.0.
* access_token: the unique number that you use to access the API after authentication. Received during authentication handshake. (*Keep it secret*)
* client_id: unique ID for your website
* client_secret: your website's "password" (*Keep it secret*)
* callback_uri: A full URL to your website. The auth provider will send the user back to this URL with the code.
* code: temporary unique code sent back from the auth provider. used to exchange for the access token.