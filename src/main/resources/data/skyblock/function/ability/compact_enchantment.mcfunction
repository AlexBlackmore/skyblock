execute store result score @s dummy run data get entity @s SelectedItem.components.skyblock:compact

execute if score @s dummy matches 10.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:1}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
execute if score @s dummy matches 500.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:2}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
execute if score @s dummy matches 1500.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:3}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
execute if score @s dummy matches 5000.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:4}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
execute if score @s dummy matches 15000.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:5}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
execute if score @s dummy matches 50000.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:6}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
execute if score @s dummy matches 150000.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:7}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
execute if score @s dummy matches 500000.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:8}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
execute if score @s dummy matches 1000000.. if items entity @s weapon.mainhand skyblock:promising_shovel[minecraft:enchantments~[{enchantments:efficiency,levels:9}]] run item modify entity @s weapon.mainhand skyblock:promising_tool
