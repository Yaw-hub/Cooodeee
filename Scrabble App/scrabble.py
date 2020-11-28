letters = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]
points = [1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 4, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10]
letter_to_points = {letter:point for letter, point in zip(letters, points)}
player_to_words = {"player1": ["BLUE", "TENNIS", "EXIT"], "wordNerd": ["EARTH", "EYES", "MACHINE"], "Lexi Con": ["ERASER", "BELLY", "HUSKY"], "Prof Reader": ["ZAP", "COMA", "PERIOD"]}
player_to_points ={}
letter_to_points[" "] = 0

def score_word(word):
  points_total = 0
  for letter in word:
    if letter_to_points.get(letter):
        points_total += letter_to_points.get(letter)
    else: 
        points_total += 0
  return points_total

def play_word(player, word):
  for players, words in player_to_words.items():
    if not player in players:
      player_to_words [player] = word
    else:
      player_to_words[player].append(word)

play_word("Yaw", "Goat")


for player, words in player_to_words.items():
  player_points = 0
  for word in words:
    player_points += score_word(word)
  player_to_points[player] = player_points

print(player_to_points)

brownie_points = score_word("BROWNIE")
print(brownie_points)
