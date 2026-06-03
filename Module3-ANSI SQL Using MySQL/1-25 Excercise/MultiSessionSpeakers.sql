SELECT speaker_name,
COUNT(*) AS total_sessions
FROM Sessions
GROUP BY speaker_name
HAVING COUNT(*) > 1
ORDER BY total_sessions DESC;
