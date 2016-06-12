# jigsawQuestionAnswer

API :

1.	/api/question 
	PUSH - 
		to add the new question with following format:
		{
		    "id": "5754205cd4c6ea5e22c55313",
		    "question": "The complete population details of Indian subcontinent are given to you in a csv format in your folder within your lab. Work on that data to find out the % of adult males, adult females, minor males and minor females from the data. Visually depict these percentages in an appropriate graph here.",
		    "chartType": "PIECHART",
		    "chartTypeMarks": 5,
		    "values": [
		      {
			"axisValue": "Virat Kohli",
			"axisData": [
			  "56"
			],
			"marks": 4.5
		      }
		    ]
		  }


2. /api/questions
	GET -
		To Get all the questions
        
