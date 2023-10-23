/*
 * An XML document type.
 * Localname: getSelosCompactados
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosCompactadosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSelosCompactados(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSelosCompactadosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosCompactadosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosCompactadosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELOSCOMPACTADOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosCompactados");
    
    
    /**
     * Gets the "getSelosCompactados" element
     */
    public br.jus.tjsc.www.selo.GetSelosCompactados getGetSelosCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosCompactados target = null;
            target = (br.jus.tjsc.www.selo.GetSelosCompactados)get_store().find_element_user(GETSELOSCOMPACTADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSelosCompactados" element
     */
    public void setGetSelosCompactados(br.jus.tjsc.www.selo.GetSelosCompactados getSelosCompactados)
    {
        generatedSetterHelperImpl(getSelosCompactados, GETSELOSCOMPACTADOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSelosCompactados" element
     */
    public br.jus.tjsc.www.selo.GetSelosCompactados addNewGetSelosCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosCompactados target = null;
            target = (br.jus.tjsc.www.selo.GetSelosCompactados)get_store().add_element_user(GETSELOSCOMPACTADOS$0);
            return target;
        }
    }
}
