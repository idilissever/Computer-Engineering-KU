from words import guess_word_list, valid_word_list
import random
print("=== W O R D L E ===")
print(f"Cached {len(guess_word_list)} guess words.")


def coloring(guessed_word_f, selected_word_f):
    letter_index_f = 0
    colored_word_list = list(guessed_word_f)
    for letter_f in guessed_word_f:
        if letter_f == selected_word[letter_index_f]:
            colored_word_list[letter_index_f] = f"\033[92m{letter_f}\033[0m"
            selected_word_f = selected_word_f[:letter_index_f] + "*" + selected_word_f[letter_index_f + 1:]
            guessed_word_f = guessed_word_f[:letter_index_f] + "+" + guessed_word_f[letter_index_f + 1:]
        letter_index_f += 1
    letter_index_f = 0
    for letter_f in guessed_word_f:
        if letter_f in selected_word_f:
            colored_word_list[letter_index_f] = f"\033[33m{letter_f}\033[0m"
            selected_word_f = selected_word_f[:selected_word_f.find(letter_f)] + "*" + selected_word_f[selected_word_f.find(letter_f)+1:]
            guessed_word_f = guessed_word_f[:letter_index_f] + "+" + guessed_word_f[letter_index_f + 1:]
        letter_index_f += 1
    return " ".join(colored_word_list)


while True:
    mode_selection = int(input('Select a mode, Enter (1) for Debug Mode, (2) for Test Mode: '))
    if mode_selection == 1:
        word_index = int(input('Enter an index in between 0-548: '))
    elif mode_selection == 2:
        word_index = random.randint(0, 548)
    else:
        continue
    selected_word = guess_word_list[word_index % len(guess_word_list)]
    print('The selected word is:', selected_word)
    break


def is_guess_valid(guessed_word_f):
    if len(guessed_word_f) == 5:
        if guessed_word_f in valid_word_list:
            return True
        else:
            print('Word', guessed_word_f, 'is not found in the list.')
            return False
    else:
        print('Word length should be 5.')
        return False


guess_remaining = 5
old_guesses = ['- - - - -'] * 5

while guess_remaining > 0:
    while True:
        guessed_word = input('Enter a word: ')
        if is_guess_valid(guessed_word):
            guess_remaining -= 1
            break
    letter_index = 0
    if guessed_word == selected_word:
        old_guesses[-guess_remaining - 1] = ' '.join(list(selected_word.upper()))
    else:
        old_guesses[-guess_remaining - 1] = coloring(guessed_word, selected_word)
    for line in old_guesses:
        print(line)
    if guessed_word == selected_word:
        break













