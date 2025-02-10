# devops-test1
GitHub → Jenkins → Ansible → Rocky Linux 서버로 이어지는 CI/CD 파이프라인을 구축

흐름 상세도

+------------+          +------------+          +------------+          +------------+
|  Developer |  ----->  |  GitHub    |  ----->  |  Jenkins   |  ----->  |  Ansible   |
+------------+          +------------+          +------------+          +------------+
                                                                            |
                                                                            v
                                                                          +------------+
                                                                         |  Rocky Linux |
                                                                         |  (Nginx 서버)|
                                                                          +------------+
