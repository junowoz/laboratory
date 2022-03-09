# Sal's Shipping

cost_normal = 0
weight = 1.5

# Ground Shipping
if weight <= 2:
    cost_normal = weight * 1.5 + 20

elif weight > 2 >= 6:
    cost_normal = weight * 3 + 20

elif weight > 6 <= 10:
    cost_normal = weight * 4 + 20

else: #weight > 10:
    cost_normal = weight * 4.75 + 20

print("Ground Shipping Normal $", cost_normal)

#Premium Shipping
cost_ground_premium = 125.00
print("Ground Shipping Premium $", cost_ground_premium)

#Drone Shipping
cost_drone = 0

if weight <= 2:
    cost_drone = weight * 4.5

elif weight > 2 >= 6:
    cost_drone = weight * 9

elif weight > 6 <= 10:
    cost_drone = weight * 12

else: #weight > 10:
    cost_drone = weight * 14.25

print("Drone Shipping $", cost_drone)
