class student:
  school = "UPang"
  @classmethod
  def introduce(self, name, age):
    self.name = name
    self.age = age
    print("Hi im " + name.lower() + " im age" , age , " year old")

i = 3
if i < 10:
  print("Bagsak Ako")

will = student

will.introduce("Will", 18)











#student1 = student
#print(student.school)


#student1.introduce(input("What is your name: "), int(input("What is your age: ")))







