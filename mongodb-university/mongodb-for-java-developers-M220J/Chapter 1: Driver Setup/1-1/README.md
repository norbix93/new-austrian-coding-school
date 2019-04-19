Problem:

Note: There should be a section of the README.rst titled "Importing Data". If you imported data into Atlas during the README lesson, you can skip this lesson.

Now that your Atlas cluster is configured correctly, let's populate it with some data.

All the data required for MFlix is contained in the data/ directory in the handout. To import this data into Atlas, use the following command (with your Atlas URI string filled in):

mongorestore --drop --gzip --uri <your-atlas-uri> data
A few tips when running mongorestore:

The --username and --password flags cannot be used with and SRV string. Instead, include the username and password in the SRV string (i.e. mongodb+srv://m220student:m220password@<your-cluster-address>)
In order to work properly, this command must be run from the top-level of the mflix-<language>/ directory, where <language> is your chosen programming language.
You can verify that the data was imported by connecting to Atlas:

mongo <your-atlas-uri>
