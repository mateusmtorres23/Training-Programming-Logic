def group_anagrams(words: list[str]) -> list[list[str]]:
    words_map: dict[str, list[str]] = {}

    for w in words:
        key = ''.join(sorted(w))
        if key not in words_map:
            words_map[key] = [w]
            continue
        words_map[key].append(w) 

    return list(words_map.values())