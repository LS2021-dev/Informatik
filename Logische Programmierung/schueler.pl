schüler(lang, ellen, '8b').
schüler(monade, lee, '7a').
klasse('7a', 308, ntg).
klasse('8b', 203, sg).
lehrkraft(schlaukopf, susi).
lehrkraft(kluge, karl).
lehrkraft(hirn, helga).
unterrichtet(schlaukopf, '7a', m).
unterrichtet(kluge, '7a', frz).
unterrichtet(hirn, '8b', m).
unterrichtet(hirn, '7a', inf) .
direktVorgesetzt(schlaukopf, kluge).
direktVorgesetzt(hirn, schlaukopf).

unterrichtetMatheUndInf(LK):-
    unterrichtet(LK, _, m);
    unterrichtet(LK, _, inf).

schülerInRaum(VORNAME, NACHNAME, RAUM):-
    schüler(VORNAME, NACHNAME, KLASSENNAME),
    klasse(KLASSENNAME, RAUM, _).

liste(VON, BIS, ZAHL) :-
    ZAHL > VON,
    ZAHL < BIS.
