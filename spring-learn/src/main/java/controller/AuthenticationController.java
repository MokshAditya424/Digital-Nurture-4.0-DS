package controller;
	import io.jsonwebtoken.Jwts;
	import io.jsonwebtoken.SignatureAlgorithm;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	import javax.servlet.http.HttpServletRequest;
	import java.util.Base64;
	import java.util.Date;

	@RestController
	public class AuthenticationController {

	    private final String SECRET_KEY = "mySecretKey"; // you can externalize it

	    @GetMapping("/authenticate")
	    public String authenticate(HttpServletRequest request) {
	        String authHeader = request.getHeader("Authorization");

	        if (authHeader != null && authHeader.startsWith("Basic ")) {
	            String base64Credentials = authHeader.substring("Basic ".length());
	            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
	            String credentials = new String(credDecoded);
	            String[] userDetails = credentials.split(":", 2);
	            String username = userDetails[0];
	            String password = userDetails[1];

	            // Normally check against DB; here we hardcode
	            if ("user".equals(username) && "pwd".equals(password)) {
	                String token = Jwts.builder()
	                        .setSubject(username)
	                        .setIssuedAt(new Date())
	                        .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10)) // 10 mins
	                        .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
	                        .compact();

	                return "{\"token\":\"" + token + "\"}";
	            }
	        }

	        return "{\"error\":\"Invalid credentials\"}";
	    }
	}


