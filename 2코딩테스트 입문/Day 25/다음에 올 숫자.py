def solution(common):
    fst, snd, trd = common[:3]
    last = common[-1]
    
    if(snd - fst) == (trd - snd):
        return last + (trd-snd)
    if(trd // snd) == (snd // fst):
        return last * (trd//snd)
