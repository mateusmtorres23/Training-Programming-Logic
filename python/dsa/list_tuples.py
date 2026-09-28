challenge = [("Godoy", "Cecilia"),("Paulo", "Godoy"),("Cecilia", "Sarah")]

def get_order(arr):
    map = {front: back for front, back in arr}

    for p in map.keys():
        if p not in map.values():
            first = p
            break

    result = [first]
    for i in result:
        if i in map.keys():
            result.append(map[i])

    print(result)

get_order(challenge)
