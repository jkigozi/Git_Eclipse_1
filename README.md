This is first repos to be fully integrated with git. Below is summary of steps for this integration:
in eclipse
	create project pointing to own workspace e.g C:\Users\jkigozi\gitec\project_1
	share project 
	commit
on Github client
	push repos to github
	and then publish
	if repos existed before and had been deleted, remember to stop tracking it before scanning for it again
			after publishing repos in github, should be able to see remote repos in eclipse
on local desktop git shell
	cd C:\Users\jkigozi\git\Git_Eclips_One (git/Git_Eclips_One
	vi README.md
	git init
	git add .
	git push -u origin master		to push to github repository
in eclipse
	create or import java classes and code as needed
on local desktop git shell
	git add .
	commit -a -m 'Suitable comments'
in eclipse
	close eclipse
	on windows, under system, set environment variable HOME = C:\Users\jkigozi\git 
	restart eclipse
	Switch to Git view
	paste link from "view on github"
	right click on master and select "pull"

