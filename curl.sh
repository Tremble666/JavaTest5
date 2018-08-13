echo "begin..."
echo "1 测试Post类型的Person登录接口"
curl -s -d "name=MARY&password=SMITH" "http://192.168.99.100:8082/customer/login"
echo ""

echo "-------2-------"
echo "2 测试get类型的Film分页接口"
curl -s "http://192.168.99.100:8082/film/list?page=1&pageSize=10"
echo ""

echo "-------3-------"
echo "3 开始测试put类型的Person新增接口，获取返回的customer_id"
curl -s -v -X PUT -d "store_id=1&first_name=MARY&last_name=SMITH&email=haha@dd.dd&address_id=5&create_date=2006-02-14 22:04:36&last_update=2006-02-15 04:57:20&active=1" "http://192.168.99.100:8082/customer/insert"
Id=$(curl -s "http://192.168.99.100:8082/getId")
echo "返回的Id的值为：$Id"
echo ""

echo "-------4-------"
echo "4 开始测试Post类型的Person更新接口"
curl -s -d "customer_id=$Id&store_id=1&first_name=MARY&last_name=SMITH&email=haha@dd.dd&address_id=5&create_date=2006-02-14 22:04:36&last_update=2006-02-15 04:57:20&active=1" "http://192.168.99.100:8082/customer/update"
echo ""

echo "-------5-------"
echo "5 开始测试delete类型的Person删除接口"
curl -v -X DELETE -d "id=$Id" "192.168.99.100:8081/customer/delete"

echo "-----end-----"