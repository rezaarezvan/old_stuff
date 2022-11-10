import random



def gissning(max):
  giss = int(input('\nGissa på ett tal mellan 1 och ' + str(max) + ':' ))
  antal = 1
  slump = random.randint(0, max)
  while slump != giss:
    antal = antal + 1
    if giss > slump:
      giss = int(input("\nGissa lägre:"))
    if giss < slump:
      giss = int(input("\nGissa högre:"))

  if slump == giss:
    print ("\nDet rätta svaret var ", slump, ".")
    if antal == 1:
     print ("\nGrattis, du gissade rätt på första försöket!")
    else:
      print ("\nGrattis, du gissade rätt! \nDu behövde", antal, "gissningar för att få korrekt svar")

  return antal


def main():

  omgångar = 0
  totalaGissningar = 0
  fortsätt = 1

  print("Välkommen till HiLo")
  

  while fortsätt == 1:
    omgångar += 1
    svårhetsgrad = int(input("\n Välj en svårhetsgrad: \n 1. Lätt: 1-10 \n 2. Medel: 1-100 \n 3. Svår: 1-1000 \n"))

    while svårhetsgrad<=0 or svårhetsgrad>3:
      print ("FELINMATNING \nDu kan bara välja en svårhetsgrad mellan 1 och 3")
      svårhetsgrad = int(input("\nVälj en svårhetsgrad: \n 1. 1-10 \n 2. 1-100 \n 3. 1-1000 \n"))

    max = 10**svårhetsgrad
    totalaGissningar = totalaGissningar + gissning(max)

    fortsätt = int(input("\nVill du spela igen? \n1. Ja \n2. Nej "))

  if fortsätt == 2:
    if omgångar == 1:
      print ("\nPå denna omgång behövde du ", totalaGissningar, " gissningar för att få rätt")
    else:
      print ("\nMedelvärdet på antal gissningar du har behövt på ", omgångar, " omgångar är ", (totalaGissningar / omgångar))

main()