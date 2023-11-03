/*
 * An XML document type.
 * Localname: getEspeciesDeTituloResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo;


/**
 * A document containing one getEspeciesDeTituloResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public interface GetEspeciesDeTituloResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEspeciesDeTituloResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0155BB0B18E3286864972FF633C0AFE").resolveHandle("getespeciesdetituloresponse9e1edoctype");
    
    /**
     * Gets the "getEspeciesDeTituloResponse" element
     */
    br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse getGetEspeciesDeTituloResponse();
    
    /**
     * Sets the "getEspeciesDeTituloResponse" element
     */
    void setGetEspeciesDeTituloResponse(br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse getEspeciesDeTituloResponse);
    
    /**
     * Appends and returns a new empty "getEspeciesDeTituloResponse" element
     */
    br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse addNewGetEspeciesDeTituloResponse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument newInstance() {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}