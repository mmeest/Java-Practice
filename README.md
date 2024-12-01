# Git setup

If you like for example push practice solution also to your own git repository as a part of your portfolio.

1. Add second remote repository in terminal:

```
git remote add <remote-nimi> <remote-repo-URL>
```

Example: 

```
git remote add second-remote https://github.com/user/another-repo.git
```
---

To disable 'pull' and 'fetch' from your second repository

2. Set 'push' configuration:

```
git remote set-url --push second-remote https://github.com/user/another-repo.git
```

3. Restrict 'fetch' and 'pull' from second remote:

```
git remote set-url second-remote no-fetch://
``` 

Or manually in '.git/config':

```
[remote "second-remote"]
    url = no-fetch://
    fetch =
    pushurl = https://github.com/user/another-repo.git
```

---

4. Test to push to second remote:

```
git push second-remote <branch-nimi>
```

5. If you wish to push to onyl one remote:

```
git push <remote-nimi> <branch-nimi>
```

Example:

```
git push second-remote main
```

---

6. If you wish to check whitch remote your branch is connected:

```
git branch -vv
```

7. To change default remote:

```
git branch --set-upstream-to=<remote-nimi>/<branch-nimi>
```

----

8. To set parallel upload to both remotes:

```
git remote set-url --add --push origin https://github.com/user/another-repo.git
```

9. Check '.git/config':

```
[remote "origin"]
    url = https://github.com/user/original-repo.git
    fetch = +refs/heads/*:refs/remotes/origin/*
    pushurl = https://github.com/user/original-repo.git
    pushurl = https://github.com/user/another-repo.git
```
