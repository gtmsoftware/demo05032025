TO test API with CRUD operation :

create :

curl -X POST http://localhost:9090/api/auto-numbers \
     -H "Content-Type: application/json" \
     -d '{"name": "Test Name", "currentValue": 123}'
	 
curl -X POST http://localhost:9090/api/auto-numbers \
     -H "Content-Type: application/json" \
     -d '{"name": "Test Name A ", "currentValue": 12}'
	 
curl -X POST http://localhost:9090/api/auto-numbers \
     -H "Content-Type: application/json" \
     -d '{"name": "Test Name B", "currentValue": 456}'


verify created records :

http://localhost:9090/api/auto-numbers


update :
  update reacord with id:{SELECTED_ID}

  curl -X PUT http://localhost:9090/api/auto-numbers/67c8a9d1e8221055b0561813 \
     -H "Content-Type: application/json" \
     -d '{"name": "Test Name A Updated ", "currentValue": 12}'

delete :
  delete reacord with id:{SELECTED_ID}

  curl -X DELETE http://localhost:9090/api/auto-numbers/67c8a9d1e8221055b0561813

  
