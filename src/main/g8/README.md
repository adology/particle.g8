<div>
  <a style="display:inline" href="wiki">
      <img class="badge-img" src="https://img.shields.io/badge/documentation-wiki-blue.svg?longCache=true" alt="blue">
  </a>
  <img style="display:inline" src="https://codebuild.us-east-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoieWEvdHh3RTVONE1XbFd3ZkI2Q3FONWFBd0dialNjOFBkc0RGUlpzVUpqTnpXbjNTYjVPWWQ0c1c4Zlo0Tm9BTkVXOXFUaFdwTS9jR3JkSlpvWXVnOXlJPSIsIml2UGFyYW1ldGVyU3BlYyI6IjlxNWNmRW1nVlZlTHl3Y0UiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=master" />
  <img style="display:inline" src="https://img.shields.io/badge/coverage-X-brightgreen.svg" />
</div>



## Commands

|Command|Description|
|-------|:------------|
|`sbt clean coverage test coverageReport`| Generates code coverage report in `/target` |
|`sbt publish` | Publishes jar to s3://{snapshots/releases}.stdmodel|