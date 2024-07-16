```toml
name = 'Create Prooduct'
method = 'POST'
url = 'http://localhost:8181/api/v1/products'
sortWeight = 3000000
id = 'c6c67def-db20-40fc-95dd-ef2b60560413'

[[headers]]
key = 'Content-Type'
value = 'application/json'

[body]
type = 'JSON'
raw = '''
{
  "productName":"test",
  "productPrice": 28000,
  "productQuantity": 40,
  "productImage":"Xiaomi.png",
}'''
```
