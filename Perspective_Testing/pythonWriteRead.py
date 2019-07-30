import json

data = {
	"Age": "lmao 25",
	}

with open('data.json', 'w') as outfile:
	json.dump(data, outfile)