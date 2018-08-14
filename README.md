# JavaTest5
Springboot + Mybatis + SpringMVC

## 运行
运行指令 'bash build.sh'
运行指令 'bash curl.sh'
运行指令 'bash stop.sh'

## 说明几点问题
程序能正常跑通，参照如下运行结果

$ bash curl.sh
begin...

1. 测试Post类型的Customer登录接口
login success!

-------2-------
2. 测试list类型的Film分页接口
[{"film_id":1,"title":"ACADEMY DINOSAUR","description":"A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies","release_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_duratio
n":6,"rental_rate":0.99,"length":86,"replacement_cost":20.99,"rating":"PG","special_features":"Deleted Scenes,Behind the Scenes","last_update":"2006-02-15 05:03:42.0"},{"film_id":2,"title":"ACE GOLDFINGER","description":"A Astounding Epistle
 of a Database Administrator And a Explorer who must Find a Car in Ancient China","release_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_duration":3,"rental_rate":4.99,"length":48,"replacement_cost":12.99,"rating":"G
","special_features":"Trailers,Deleted Scenes","last_update":"2006-02-15 05:03:42.0"},{"film_id":3,"title":"ADAPTATION HOLES","description":"A Astounding Reflection of a Lumberjack And a Car who must Sink a Lumberjack in A Baloon Factory","r
elease_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_duration":7,"rental_rate":2.99,"length":50,"replacement_cost":18.99,"rating":"NC-17","special_features":"Trailers,Deleted Scenes","last_update":"2006-02-15 05:03:4
2.0"},{"film_id":4,"title":"AFFAIR PREJUDICE","description":"A Fanciful Documentary of a Frisbee And a Lumberjack who must Chase a Monkey in A Shark Tank","release_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_durati
on":5,"rental_rate":2.99,"length":117,"replacement_cost":26.99,"rating":"G","special_features":"Commentaries,Behind the Scenes","last_update":"2006-02-15 05:03:42.0"},{"film_id":5,"title":"AFRICAN EGG","description":"A Fast-Paced Documentary
 of a Pastry Chef And a Dentist who must Pursue a Forensic Psychologist in The Gulf of Mexico","release_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_duration":6,"rental_rate":2.99,"length":130,"replacement_cost":22.
99,"rating":"G","special_features":"Deleted Scenes","last_update":"2006-02-15 05:03:42.0"},{"film_id":6,"title":"AGENT TRUMAN","description":"A Intrepid Panorama of a Robot And a Boy who must Escape a Sumo Wrestler in Ancient China","release
_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_duration":3,"rental_rate":2.99,"length":169,"replacement_cost":17.99,"rating":"PG","special_features":"Deleted Scenes","last_update":"2006-02-15 05:03:42.0"},{"film_id":
7,"title":"AIRPLANE SIERRA","description":"A Touching Saga of a Hunter And a Butler who must Discover a Butler in A Jet Boat","release_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_duration":6,"rental_rate":4.99,"len
gth":62,"replacement_cost":28.99,"rating":"PG-13","special_features":"Trailers,Deleted Scenes","last_update":"2006-02-15 05:03:42.0"},{"film_id":8,"title":"AIRPORT POLLOCK","description":"A Epic Tale of a Moose And a Girl who must Confront a
 Monkey in Ancient India","release_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_duration":6,"rental_rate":4.99,"length":54,"replacement_cost":15.99,"rating":"R","special_features":"Trailers","last_update":"2006-02-1
5 05:03:42.0"},{"film_id":9,"title":"ALABAMA DEVIL","description":"A Thoughtful Panorama of a Database Administrator And a Mad Scientist who must Outgun a Mad Scientist in A Jet Boat","release_year":"2006-01-01","language_id":1,"original_lan
guage_id":null,"rental_duration":3,"rental_rate":2.99,"length":114,"replacement_cost":21.99,"rating":"PG-13","special_features":"Trailers,Deleted Scenes","last_update":"2006-02-15 05:03:42.0"},{"film_id":10,"title":"ALADDIN CALENDAR","descri
ption":"A Action-Packed Tale of a Man And a Lumberjack who must Reach a Feminist in Ancient China","release_year":"2006-01-01","language_id":1,"original_language_id":null,"rental_duration":6,"rental_rate":4.99,"length":63,"replacement_cost":
24.99,"rating":"NC-17","special_features":"Trailers,Deleted Scenes","last_update":"2006-02-15 05:03:42.0"}]

-------3-------
3. 测试put类型的Customer新增接口，获取返回的customer_id
* timeout on name lookup is not supported
*   Trying 192.168.99.100...
* Connected to 192.168.99.100 (192.168.99.100) port 8082 (#0)
> PUT /customer/insert HTTP/1.1
> Host: 192.168.99.100:8082
> User-Agent: curl/7.49.1
> Accept: */*
> Content-Length: 145
> Content-Type: application/x-www-form-urlencoded
>
} [145 bytes data]
* upload completely sent off: 145 out of 145 bytes
< HTTP/1.1 200 OK
< Connection: keep-alive
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 3
< Date: Tue, 14 Aug 2018 03:27:28 GMT
<
{ [3 bytes data]
* Connection #0 to host 192.168.99.100 left intact
return id：600

-------4-------
4. 测试Post类型的Customer更新接口
{"customer_id":600,"store_id":1,"first_name":"MARY","last_name":"SMITH","email":"haha@dd.dd","address_id":5,"active":true,"create_date":"2006-02-14 22:04:36","last_update":"2006-02-15 04:57:20"}
update successs

-------5-------
5. 测试delete类型的Customer删除接口
* timeout on name lookup is not supported
*   Trying 192.168.99.100...
* Connected to 192.168.99.100 (192.168.99.100) port 8082 (#0)
> DELETE /customer/delete HTTP/1.1
> Host: 192.168.99.100:8082
> User-Agent: curl/7.49.1
> Accept: */*
> Content-Length: 6
> Content-Type: application/x-www-form-urlencoded
>
* upload completely sent off: 6 out of 6 bytes
< HTTP/1.1 200 OK
< Connection: keep-alive
< Content-Length: 0
< Date: Tue, 14 Aug 2018 03:27:29 GMT
<
* Connection #0 to host 192.168.99.100 left intact
delete successs
-----end-----
