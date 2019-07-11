from flask import Flask, render_template
app = Flask(__name__)

@app.route("/", methods=["GET"])
def output():
	return render_template("First_Test.html")
 	
if __name__ == "__main__":
	app.run(debug=True)