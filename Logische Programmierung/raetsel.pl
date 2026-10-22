% Tag - Fach - Lehrer - Raum

einTagVor(T1, T2, [T1, T2, _, _, _]).
einTagVor(T1, T2, [_, T1, T2, _, _]).
einTagVor(T1, T2, [_, _, T1, T2, _]).
einTagVor(T1, T2, [_, _, _, T1, T2]).

nachbarTag(T1, T2, L):- einTagVor(T1, T2, L); einTagVor(T2, T1, L).

rätselLösung(X) :-
    X = [[mo, _, _, _], [di, _, _, _], [mi, _, _, _], [do, _, _, _], [fr, _, _, _]],
    
    member([do, inf, _, _], X),
    einTagVor([_, _, _, 16], [_, geo, _, 19], X),
    einTagVor([_, _, kluge, _], [_, e, clever, _], X),
    member([_, m, helle, _], X),
    nachbarTag([_, geo, _, _], [_, inf, _, _], X),
    nachbarTag([_, e, _, _], [_, inf, _, _], X),
    nachbarTag([_, _, _, 15], [_, _, _, 17], X),
    member([_, _, helle, 18], X),
    member([_, _, schlau, 16], X),
    nachbarTag([_, c, _, _], [_, _, schlau, _], X),
    member([fr, _, _, 15], X).