execute as @a run function skyblock:attributes
execute as @e[type=#skyblock:custom_name_visible] unless data entity @s CustomNameVisible run data modify entity @s CustomNameVisible set value true
execute as @e[type=#skyblock:hostile,tag=!RUNIC,tag=!NOT_RUNIC] if predicate skyblock:is_runic run tag @s add RUNIC
execute as @e[type=#skyblock:hostile,tag=!RUNIC,tag=!NOT_RUNIC] run tag @s add NOT_RUNIC