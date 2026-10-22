% Saal - Person - Essen - Film

nächsterSaal(S1, S2, [S1, S2, _, _, _]).
nächsterSaal(S1, S2, [_, S1, S2, _, _]).
nächsterSaal(S1, S2, [_, _, S1, S2, _]).
nächsterSaal(S1, S2, [_, _, _, S1, S2]).

benachbarteSäle(S1, S2, L):- nächsterSaal(S1, S2, L); nächsterSaal(S2, S1, L).

rätselLösung(X):-
    X = [[1, _, _, _], [2, _, _, _], [3, _, _, _], [4, _, _, _], [5, _, _, _]],
    
    member([_, david, chips, _], X),
    member([5, _, popcorn, _], X),
    member([_, charlotte, _, dokumentation], X),
    member([4, _, _, liebesfilm], X),
    benachbarteSäle([_, _, _, liebesfilm], [_, _, _, actionfilm], X),
    benachbarteSäle([_, _, _, liebesfilm], [_, _, _, komödie], X),
    nächsterSaal([_, amira, _, _], [_, ben, _, komödie], X),
    nächsterSaal([_, _, chips, _], [_, _, nachos, actionfilm], X),
    benachbarteSäle([_, _, gummibärchen, _], [_, _, popcorn, _], X),
    nächsterSaal([_, _, _, drama], [_, ella, _, _], X),
    member([_, _, eis, dokumentation], X).