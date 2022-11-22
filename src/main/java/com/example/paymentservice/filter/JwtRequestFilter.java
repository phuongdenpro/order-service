//package com.example.paymentservice.filter;
//
//
//import com.example.paymentservice.template.User;
//import com.squareup.okhttp.*;
//import io.micrometer.core.ipc.http.HttpSender;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
////import org.springframework.security.core.GrantedAuthority;
////import org.springframework.security.core.authority.SimpleGrantedAuthority;
////import org.springframework.security.core.context.SecurityContextHolder;
////import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.*;
//
//@Component
//public class JwtRequestFilter extends OncePerRequestFilter {
//    @Autowired
//    private RestTemplate restTemplate;
//    private static final String BASE_URL
//            = "http://localhost:8000/api/user/info/";
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
//            throws ServletException, IOException {
//        String authorization = httpServletRequest.getHeader("Authorization");
//        String token = null;
//        User user = null;
//
//        if (null != authorization && authorization.startsWith("Bearer ")) {
//            token = authorization.substring(7);
//            OkHttpClient client = new OkHttpClient();
//            MediaType mediaType = MediaType.parse("text/plain");
//            RequestBody body = RequestBody.create(mediaType, "");
//            Request request = new Request.Builder()
//                    .url("127.0.0.1:8000/api/user/info/")
//                    .method("GET", body)
//                    .addHeader("Authorization", "Bearer "+token)
//                    .build();
//            Response response = client.newCall(request).execute();
//        }
//
////        if (null != user && SecurityContextHolder.getContext().getAuthentication() == null) {
////            UserDetails userDetails
////                    = userService.loadUserByUsername(userName);
////
////            if (jwtUtility.validateToken(token, userDetails)) {
////                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
////                        = new UsernamePasswordAuthenticationToken(userDetails,
////                        null, userDetails.getAuthorities());
////
////                usernamePasswordAuthenticationToken.setDetails(
////                                                new WebAuthenticationDetailsSource().buildDetails(httpServletRequest)
////                );
////
////                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
////            }
////
////        }
//        filterChain.doFilter(httpServletRequest, httpServletResponse);
//    }
//}