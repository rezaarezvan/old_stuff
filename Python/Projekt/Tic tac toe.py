import keyboard

def ritaUtBoard(board):
		board_längd = len(board)

		for i in range(board_längd):
			for j in range(board_längd):
				if(j > 1):
					print(board[i][j])
				else:
					print(board[i][j], end="|")

def clear():
    	print(chr(27) + "[2J")

def ändraBoard(board, spelarInput, vilkenSpelare):
    	
		if vilkenSpelare == 'X':
			svar = 'X'
		elif vilkenSpelare == 'O':
			svar = 'O'

		if spelarInput == 1:
			board[0][0]
		elif spelarInput == 2:
			board[0][1] = svar
		elif spelarInput == 3:
			board[0][2] = svar
		elif spelarInput == 4:
			board[1][0] = svar
		elif spelarInput == 5:
			board[1][1] = svar
		elif spelarInput == 6:
			board[1][2] = svar
		elif spelarInput == 7:
			board[2][0] = svar
		elif spelarInput == 8:
			board[2][1] = svar
		elif spelarInput == 9:
			board[2][2] = svar

		ritaUtBoard(board)

SPELARE_1 = 'X'
SPELARE_2 = 'O'

board = [['0','0','0'],
		 ['0','0','0'],
		 ['0','0','0']]

ritaUtBoard(board)

while True:
	spelar1Input = input("Ange en ruta (1-9) Spelare 1")
	ändraBoard(board, spelar1Input, SPELARE_1)

	spelar2Input = input("Ange en ruta (1-9) Spelare 2")
	ändraBoard(board, spelar2Input, SPELARE_2)

