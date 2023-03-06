Mass = float(input("Enter an object’s mass :"))                         #Asking user to enter an object's mass.
Weight = Mass * 9.8                                                      # Converting mass in kilograms to weight in newtons.
Message = ""
if Weight > 1000:                                                       #Checking if weight is above 1000 or not.
Message = " The object is too heavy at " + format(Weight, ',.2f') +" newtons."     # If it is true update the message.
elif Weight < 10:                                                         #Checking if weight is below 10 or not.
Message = "The object is too light at"  + format(Weight, ',.2f') + " newtons." # if it is true update the message.
print(Message)                                                                # Display the result
