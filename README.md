# Jenkins - Ansible을 이용한 웹서버 자동화 배포


# 구성 목표 
GitHub → Jenkins → Ansible → Linux(Nginx 웹서버) 서버로 이어지는 CI/CD 파이프라인을 구축하여 자동 배포가 가능한 시스템을 구성합니다.


# 구성 순서도

itHub 설정

inventory.ini에서 대상 서버의 Ansible 인벤토리 설정

GitHub에서 코드 변경이 발생하면 Jenkins가 트리거됨

Ansible 플레이북 구성

nginx-playbook.yml: Nginx 설치 및 설정

추가적인 애플리케이션 배포 및 환경 설정 포함

서버 연결 및 배포

Ansible을 통해 각 서비스 배포 시 SSH 연결 사용

Ansible 전용 계정(ansible)을 활용하여 원격 서버에 접근

방화벽 및 디렉토리 설정

각 서비스에 필요한 방화벽 규칙 추가

Nginx 관련 디렉토리 생성 및 권한 설정 포함

로그 수집 및 확인

웹 서버(Nginx) 로그를 수집 및 저장

로그 분석 및 모니터링 시스템 연계 가능

결과 검증

웹 서버(Nginx)에 접속하여 애플리케이션이 정상적으로 동작하는지 확인

로그 데이터를 기반으로 배포 상태 및 서비스 가용성 점검
