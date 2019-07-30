# app.py
import sys
from flask import Flask, request, render_template, redirect, Response
import random, json

app = Flask(__name__)

@app.route('/')
def output():
	# serve index template
	return render_template('index.html')

@app.route('/receiver', methods = ['POST'])
def worker():
	# read json + reply
	data = request.get_json()
	return "data"
	print(data)
	#with open('data.json', 'w') as outfile:
		#json.dump(result, outfile)

if __name__ == "__main__":
    app.run(debug = True)