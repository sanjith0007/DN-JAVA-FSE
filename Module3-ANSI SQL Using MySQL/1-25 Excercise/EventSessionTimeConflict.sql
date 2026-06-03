SELECT s1.event_id, s1.title AS session_one,
s2.title AS session_two,s1.start_time,s1.end_time,s2.start_time,s2.end_time
FROM Sessions s1JOIN Sessions s2ON s1.event_id = s2.event_id
AND s1.session_id  s2.start_time;
