# Webscrapper to JSON or EMF model

## Installation

**Standard mode**

Install and open [Eclipse-Installer](https://www.eclipse.org/downloads/download.php?file=/oomph/products/eclipse-inst-win64.exe), then just go on settings and enable `Web-Links`.

Afterwards, click **twice** on ![](https://img.shields.io/badge/eclipse--install-install-red?logo=eclipse&link=eclipse%2Binstaller:https://raw.githubusercontent.com/pdulvp/eclipse-retriever/master/target/product.setup)

**Advanced mode**

Install [Eclipse-Installer](https://www.eclipse.org/downloads/download.php?file=/oomph/products/eclipse-inst-win64.exe). 

`Advanced mode` > `Add user products` > and choose [Setup file](https://raw.githubusercontent.com/pdulvp/eclipse-retriever/master/target/product.setup)

**In an existing Eclipse platform**

`Help` > `Install new Software` > and choose [Update site](https://pdulvp.github.io/eclipse-repository/eclipse-retriever)

## How to use it

**Create a new project**

![](images/new-project.png)

Once created, it will appear in the `Project Explorer`. Just double click on the `.retriever` file to open the editor.

![](images/wiki-project.png)

**Describe how to fetch the site**

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/URLRetriever.png) URL

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/ElementRetriever.png) Element

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/AttributeRetriever.png) Attribute


![](images/fetch.png)

In this sample, we will retrieve from a Wikipedia page, its `title`, the `lastModified` date and `artists` of the music supergroup described in the page.

**Run it**

- Select the top ![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/URLRetriever.png) `highwaymen` element

- On the main toolbar, just click on ![](plugins/org.pdulvp.retriever.ui/icons/obj16/fetch.gif) `Fetch`

Result appears on the bottom.

![](images/result.png)

By doubleclicking on the top ![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/URIResult.png) `highwaymen`, the JSON editor opens.

![](images/result-json.png)

**Fetch sub pages**

From an element, we can fetch sub pages. 

Here, retrieved `links` are relative, by using ![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/SetVariable.png) `Set Variable`, we can compute a `fullURL`.

Then we add a child ![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/URLRetriever.png) `URL element` towards this `fullURL` and retrieve some attributes from the sub page.

![](images/sub-page.png)

By ![](plugins/org.pdulvp.retriever.ui/icons/obj16/fetch.gif) `Fetch` again, the result becomes:

![](images/result-sub-page.png)

or as JSON: 

![](images/result-sub-page-json.png)

**Models manipulation**

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/LoadResource.png) `LoadResource` allows to create/load a resource from workspace.

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/CreateEObject.png) `CreateEObject` allows to create the given EObject.

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/CreateEAttribute.png) `CreateEAttribute` allows to set the given attribute on an EObject.

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/CreateEReference.png) `CreateEReference` allows to set the given reference on an EObject.

For instance, load the resource `schema.ecore`, retrieve the `root` element. If the resource is empty, create a root element called `Artists`

![](images/emf-root.png)

Some expressions used above

- ![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/SetVariable.png) `resource:<variable>.root` expression allows to retrieve the root of a resource.

- ![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/SetVariable.png) `variable:<variable>.isNull` returns whether the variable is `null` or not.


With the following example, we will create an EClass into `schema.ecore` for each album on the page.

![](images/emf-fetch-artist-page.png)
![](images/emf-ecore-cash.png)

If fetched again, new albums will be added to the file.

**Reuse retrievers**

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/ReferencedRetriever.png) `ReferencedRetriever` allows to reuse a retriever. According to variables, it may behave differently.

For instance, if we update our top ![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/URLRetriever.png) `artistPage` from 
![](images/retriever-artist-cash.png)

to 

![](images/reuse-retriever.png)

We can now fetch two different pages. The ecore will contain both artist albums.

![](images/ecore-all-albums.png)

**Additional operators**

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/URLRetriever.png) `If` allowing to process only if the `conditionExpression` is true

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/TransformationService.png) `TransformationService` allowing to define a service from a `java` class and method, to text-processing fetched results using `java`.

![](plugins/org.pdulvp.retriever.edit/icons/full/obj16/TransformationRetriever.png) `TransformationRetriever` allowing to retrieve an element, but passed directly to a `TransformationService` `[TO IMPROVE / TO DELETE / TBD]`

