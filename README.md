# devops-test1

#구성 목표 
GitHub → Jenkins → Ansible → Rocky Linux 서버로 이어지는 CI/CD 파이프라인을 구축


#구성안
<VS code → Git hub 연동 → Git hub - Jenkins 서버 연동 → Jenkins 서버내 ansible 설치 및 배포 예정서버와 SSH 연결 (공개키 복사) → Git hun 내 push 발생시 Nginx 자동 배포 → 웹 서버 동작 완료>


[git hub webhook을 이용한 연결,jenkins와 git hub간의 ssh를 이용한 인증 설정]


흐름 상세도


![image](https://github.com/user-attachments/assets/bc274dab-3bdf-4885-814b-08e591046fd9)


