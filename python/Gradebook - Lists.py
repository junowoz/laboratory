#Gradebook - lists

last_semester_gradebook = [["politics", 80], ["latin", 96], ["dance", 97], ["architecture", 65]]

# Your code below:
subjects = ["physics", "calculus", "poetry", "history"]
grades = [98, 97, 85, 88]

#Creating the 2d list:
gradebook = [["physics", 98], ["calculus", 97], ["poetry", 85], ["history", 88]]

#adding more subjects to the 2d list:
gradebook.append(["computer science", 100])
gradebook.append(["visual arts", 93])

#Modify the gradebook (visual arts to 87)
gradebook[5][1] = 87

#deleting the poetry class grade
gradebook[2].remove(85)

#adding a pass value to the poetry
gradebook[2].append("Pass")

#one big gradebook
full_gradebook = last_semester_gradebook + gradebook

#printing the full gradebook
print(full_gradebook)