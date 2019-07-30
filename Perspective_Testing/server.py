# app.py
import sys
from flask import Flask, request, render_template, redirect, Response, jsonify
import random, json

app = Flask(__name__)

@app.route('/')
def output():
	# serve index template
	return render_template('index.html')

@app.route('/receiver', methods = ['POST'])
def worker():
	num_list = [1,2,3,4,5]
	num_dict = {'numbers' : num_list, 'name' : 'Numbers'}
	try:
		data = request.get_json()
		return data
	except:
		return 'failed'

if __name__ == "__main__":
    app.run(debug = True)