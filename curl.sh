echo "begin..."
echo "1 测试Post类型的Person登录接口"
status=$(curl -s -d "name=MARY&password=SMITH" "http://192.168.99.100:8082/customer/login")
echo "$status"

echo "-------2-------"
echo "2 测试list类型的Film分页接口"
res=$(curl -s "http://192.168.99.100:8082/film/list?page=1&pageSize=10")
echo "$res"

echo "-------3-------"
echo "3 测试put类型的Person新增接口，获取返回的customer_id"
Id=$(curl -s -v -X PUT -d "store_id=1&first_name=MARY&last_name=SMITH&email=haha@dd.dd&address_id=5&create_date=2006-02-14 22:04:36&last_update=2006-02-15 04:57:20&active=1" "http://192.168.99.100:8082/customer/insert")
echo "return id：$Id"

echo "-------4-------"
echo "4 测试Post类型的Person更新接口"
user=$(curl -s -d "customer_id=$Id&store_id=1&first_name=MARY&last_name=SMITH&email=haha@dd.dd&address_id=5&create_date=2006-02-14 22:04:36&last_update=2006-02-15 04:57:20&active=1" "http://192.168.99.100:8082/customer/update")
echo "$user"
echo "update successs"

echo "-------5-------"
echo "5 测试delete类型的Person删除接口"
curl -v -X DELETE -d "id=$maxPersonId" "192.168.99.100:8082/customer/delete"
echo "delete successs"

echo "-----end-----"