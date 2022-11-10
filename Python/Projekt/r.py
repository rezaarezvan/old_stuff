board = ["-", "-", "-",
         "-", "-", "-",
         "-", "-", "-",]


spel_fortsätter = True

vinnare = None

current_spelare = "X"

spela()

while spel_fortsätter:
        hantera_turn(current_spelare)

        kolla_game_over()

        # byt_spelare()

def rita_board():
    print(board[0] + "|" + board[1] + "|" + board[2])
    print(board[3] + "|" + board[4] + "|" + board[5])
    print(board[6] + "|" + board[7] + "|" + board[8])

def spela():
    rita_board()    

def hantera_turn():
    val = input("Välj en ruta (1-9)")
    val = int(val) - 1

    board[val] = "X"
    rita_board()

def kolla_game_over():
    kolla_vinst()
    kolla_tie()

def kolla_vinst():
    # rows
    # columns
    # diagonal
