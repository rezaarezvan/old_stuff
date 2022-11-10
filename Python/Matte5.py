antalBilarStaden = 1
antalBilarFlygplats = 104
procentSomStannarStad = 0.70
procentSomLämnarStad = 0.3
procentSomStannarFlygplats = 0.25
procentSomLämnarFlygplats = 0.75
i = 1

while antalBilarFlygplats > 0:
	
	antalBilarFrånStadTillFlygplats = antalBilarStaden * procentSomLämnarStad 
	
	antalBilarFrånFlygplatsTillStad = antalBilarFlygplats * procentSomLämnarFlygplats

	antalBilarSomStadFår = antalBilarFrånFlygplatsTillStad
	antalBilarSomFlygplatsFår = antalBilarFrånStadTillFlygplats

	antalBilarEfterEnMånadStad = (antalBilarStaden - antalBilarFrånStadTillFlygplats + antalBilarSomStadFår)
	antalBilarEfterEnMånadFlygplats = (antalBilarFlygplats - antalBilarFrånFlygplatsTillStad + antalBilarSomFlygplatsFår)	

	if(antalBilarStaden == antalBilarEfterEnMånadStad and antalBilarFlygplats == antalBilarEfterEnMånadFlygplats):
		print('\nFall: ' + str(i))
		print('\nAntal Bilar i Staden: ' + str(antalBilarStaden) + '\nAntalet bilar på flygplatsen: ' + str(antalBilarFlygplats))
	
		print('\nAntalet bilar i staden efter en månad: ' + str(antalBilarEfterEnMånadStad))
		print('\nAntalet bilar på flygplatsen efter en månad: ' + str(antalBilarEfterEnMånadFlygplats))
		break
		
	elif (abs(antalBilarFrånFlygplatsTillStad - antalBilarFrånStadTillFlygplats) < 1):
		print('\nFall: ' + str(i))
		print('\nAntal Bilar i Staden: ' + str(antalBilarStaden) + '\nAntalet bilar på flygplatsen: ' + str(antalBilarFlygplats))
	
		print('\nAntalet bilar i staden efter en månad: ' + str(antalBilarEfterEnMånadStad))
		print('\nAntalet bilar på flygplatsen efter en månad: ' + str(antalBilarEfterEnMånadFlygplats))
		break
	
	elif antalBilarFlygplats == 1:
		print("Finns ingen heltalslösning/för mycket skillnad! :)")

	antalBilarStaden += 1
	antalBilarFlygplats -= 1
	i += 1