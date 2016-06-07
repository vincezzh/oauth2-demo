1. 打开UserService.java文件，那里是登录时进行验证并且获得token的地方

2. 初始化OAuth数据库，运行db.sql

3. 在表oauth_client_details中，access_token_validity是访问token生命长度，refresh_token_validity是刷新token的生命长度，单位都是秒

4. 获得token方法，GET和POST都可以
http://localhost:8080/demo/oauth/token?client_id=MobilePortalId&client_secret=mobile_secret&grant_type=password&username=vince&password=123
{
  "access_token": "69175a72-7cc7-486d-b50f-0564aac429a8",
  "token_type": "bearer",
  "refresh_token": "2249e603-962b-439b-8f85-58775f592193",
  "expires_in": 2999,
  "scope": "read write"
}

5. 访问资源时，把token放入http header中，GET和POST都可以  Authorization: Bearer 69175a72-7cc7-486d-b50f-0564aac429a8

6. oauth-security.xml中配置了OAuth2的配置，也添加了哪些路径需要token，哪些路径不需要token，参见第81行