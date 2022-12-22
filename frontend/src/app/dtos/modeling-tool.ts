import {AppFramework} from "./app-framework";
import {Category} from "./category";

// TODO: Platform & programmingLanguage should be a list of enums
// TODO: Switch data type of category to an enum?
// TODO: Switch data type of programming language from string to an array of ProgrammingLanguage
// TODO: Merge Web App and Desktop App?
// TODO: SourceCodeGeneration: Provice languages?
// TODO: Add asynchronous collab
// Add a "VSC Extention" entry?
export interface ModelingTool {
  name: string;
  link: string;
  openSource?: boolean;
  appFramework?: AppFramework;
  webApp?: boolean;
  desktopApp?: boolean;
  category?: string;
  modelingLanguages?: [string];
  sourceCodeGeneration?: boolean;
  cloudService?: boolean;
  license?: string;
  loginRequired?: boolean;
  realTimeCollab?: boolean;
  creator?: string;
  platform?: string;
  programmingLanguages?: [string];
}

// TODO: Category -> boolean values for each category
// TODO: Platform -> boolean values for each category
// TODO: Programming Language -> boolean values for each language
export interface ModelingToolSearch {
  name?: string;
  link?: string;
  openSource?: boolean;
  appFramework?: AppFramework;
  webApp?: boolean;
  desktopApp?: boolean;
  category?: string;
  license?: string;
  loginRequired?: boolean;
  creator?: string;
  platform?: string;
  programmingLanguage?: string;
}

export interface CheckedModelingToolColumns {
  openSource: boolean;
  appFramework: boolean;
  category: boolean;
  license: boolean;
  loginRequired: boolean;
  creator: boolean;
  os: boolean;
  programmingLanguage: boolean;
}
