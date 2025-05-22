scoreboard players set @s dummy 0
execute store result score @s dummy run data get entity @s SelectedItem.components.skyblock:blocks_broken 0.01
item modify entity @s[scores={dummy=..25}] weapon.mainhand skyblock:stored_potential