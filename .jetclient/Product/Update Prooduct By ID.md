```toml
name = 'Update Prooduct By ID'
method = 'PUT'
url = 'http://localhost:8181/api/v1/products/5'
sortWeight = 4000000
id = '2036cb98-cc6b-4c91-a669-a67c0a2961ab'

[[headers]]
key = 'Content-Type'
value = 'application/json'

[body]
type = 'JSON'
raw = '''
{
  "productName":"Iphone",
  "productPrice": 35000,
  "productQuantity": 50,
  "productImage":"Test.png"
}'''
```
