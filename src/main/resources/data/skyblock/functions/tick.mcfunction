execute as @e[type=minecraft:text_display] store result score @s portalCooldown run data get entity @s PortalCooldown
execute as @e[type=minecraft:text_display,scores={portalCooldown=2..}] run scoreboard players remove @s portalCooldown 1
execute as @e[type=minecraft:text_display,scores={portalCooldown=1}] run kill @s
execute as @e[type=minecraft:text_display,scores={portalCooldown=2..}] store result entity @s PortalCooldown int 1 run scoreboard players get @s portalCooldown
