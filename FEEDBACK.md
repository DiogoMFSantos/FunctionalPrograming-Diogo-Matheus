## General Feedback

Awesome work! You covered the full feature list with streams and try-with-resources, and the two files in `resources` plus the demo class make the API easy to follow.

### To improve / consider
- `linesWithWord` uses `contains()`, so `"my"` also matches inside `"myself"`. Checking a word-boundary regex  is closer to finding that word.
- Top *n* longest words skip `distinct()`, so the same word can appear several times.


Great job, keep it up!
